$('#search').click(function(){
  var searchInputValue = $('#searchInput').val();
  window.location.replace('/search?value=' + searchInputValue)
  
})