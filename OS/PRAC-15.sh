echo "Enter String"
a=$(awk 'BEGIN{
    getline str;
    print toupper(str);
}')
echo $a
