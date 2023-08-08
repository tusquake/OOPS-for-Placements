class parent {
    protected void m1() {

    }
}

class child extends parent {
    public void m1() {
        // Cannot reduce the scope of function while overriding
        // but we can increase the scope
        // Compiler Error : Atempting to assign weaker access privileges

        // private < default < protected < public

    }
}