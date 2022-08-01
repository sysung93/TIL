import Responsive from '../components/common/Responsive';
import EditorContainer from '../containers/write/EditorContatiner';
import TagBoxContainer from '../containers/write/TagBoxContainer';
import WriteActionButtonsContainer from '../containers/write/WriteActionButtonsContainer';
import { Helmet } from 'react-helmet-async';
import HeaderContainer from '../containers/common/HeaderContainer';

const WritePage = () => {
  return (
    <Responsive>
      <Helmet>
        <title> 글 작성하기 </title>
      </Helmet>
      <HeaderContainer />
      <EditorContainer />
      <TagBoxContainer />
      <WriteActionButtonsContainer />
    </Responsive>
  );
};

export default WritePage;
