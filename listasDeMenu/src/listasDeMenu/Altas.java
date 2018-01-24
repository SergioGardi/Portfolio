
package listasDeMenu;

	public abstract class maestro 
{
		private int idMaestro;
		private String nombre;
		private String mail;
		private String curp;
		private String direccion;
		private int telefono;
		private String estudios;
		private int experiencia;
	
		public int getIdMaestro() {
		return idMaestro;
	}
		public void setIdMaestro(int idMaestro) {
		this.idMaestro = idMaestro;
	}
		public String getNombre() {
		return nombre;
	}
		public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		public String getMail() {
		return mail;
	}
		public void setMail(String mail) {
		this.mail = mail;
	}
		public String getCurp() {
		return curp;
	}
		public void setCurp(String curp) {
		this.curp = curp;
	}
		public String getDireccion() {
		return direccion;
	}
		public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
		public int getTelefono() {
		return telefono;
	}
		public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
		public String getEstudios() {
		return estudios;
	}
		public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
		public int getExperiencia() {
		return experiencia;
	}
		public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

}
	public abstract class alumno
	{	
		private int idAlumno;
		private String nombre;
		private String mail;
		private String curp;
		private String direccion;
		private int telefono;
		private int edad;
			
		public int getIdAlumno() {
				return idAlumno;
			}
		public void setIdAlumno(int idAlumno) {
				this.idAlumno = idAlumno;
			}
		public String getNombre() {
				return nombre;
			}
		public void setNombre(String nombre) {
				this.nombre = nombre;
			}
		public String getMail() {
				return mail;
			}
		public void setMail(String mail) {
				this.mail = mail;
			}
		public String getCurp() {
				return curp;
			}
		public void setCurp(String curp) {
				this.curp = curp;
			}
		public String getDireccion() {
				return direccion;
			}
		public void setDireccion(String direccion) {
				this.direccion = direccion;
			}
		public int getTelefono() {
				return telefono;
			}
		public void setTelefono(int telefono) {
				this.telefono = telefono;
			}
		public int getEdad() {
				return edad;
			}
		public void setEdad(int edad) {
				this.edad = edad;
			}
	
	public abstract class cursos {

		private int idCurso;
		private String Matematicas;
		private String Español;
		private String Geografia;
		private String Sistemas;
		private String Proyectos;
		private String Administracion;
		private String Contabilidad;
		private String Finanzas;
					
		public int getIdCurso() {
						return idCurso;
					}
		public void setIdCurso(int idCurso) {
						this.idCurso = idCurso;
					}
		public String getMatematicas() {
						return Matematicas;
					}
		public void setMatematicas(String matematicas) {
						Matematicas = matematicas;
					}
		public String getEspañol() {
						return Español;
					}
		public void setEspañol(String español) {
						Español = español;
					}
		public String getGeografia() {
						return Geografia;
					}
		public void setGeografia(String geografia) {
						Geografia = geografia;
					}
		public String getSistemas() {
						return Sistemas;
					}
		public void setSistemas(String sistemas) {
						Sistemas = sistemas;
					}
		public String getProyectos() {
						return Proyectos;
					}
		public void setProyectos(String proyectos) {
						Proyectos = proyectos;
					}
		public String getAdministracion() {
						return Administracion;
					}
		public void setAdministracion(String administracion) {
						Administracion = administracion;
					}
		public String getContabilidad() {
						return Contabilidad;
					}
		public void setContabilidad(String contabilidad) {
						Contabilidad = contabilidad;
					}
		public String getFinanzas() {
						return Finanzas;
					}
		public void setFinanzas(String finanzas) {
						Finanzas = finanzas;
					}
			
	public abstract class salones {
			
		private int idCurso;
		private String salon1;
		private String salon2;
		private String salon3;
		private String salon4;
		private String salon5;
		private String salon6;
		private String salon7;
		private String salon8;
				
		public int getIdCurso() {
					return idCurso;
				}
		public void setIdCurso(int idCurso) {
					this.idCurso = idCurso;
				}
		public String getSalon1() {
					return salon1;
				}
		public void setSalon1(String salon1) {
					this.salon1 = salon1;
				}
		public String getSalon2() {
					return salon2;
				}
		public void setSalon2(String salon2) {
					this.salon2 = salon2;
				}
		public String getSalon3() {
					return salon3;
				}
		public void setSalon3(String salon3) {
					this.salon3 = salon3;
				}
		public String getSalon4() {
					return salon4;
				}
		public void setSalon4(String salon4) {
					this.salon4 = salon4;
				}
		public String getSalon5() {
					return salon5;
				}
		public void setSalon5(String salon5) {
					this.salon5 = salon5;
				}
		public String getSalon6() {
					return salon6;
				}
		public void setSalon6(String salon6) {
					this.salon6 = salon6;
				}
		public String getSalon7() {
					return salon7;
				}
		public void setSalon7(String salon7) {
					this.salon7 = salon7;
				}
		public String getSalon8() {
					return salon8;
				}
		public void setSalon8(String salon8) {
					this.salon8 = salon8;
				}
	
	public abstract class asignacion {

		private int idAsignatura;
		private String asignacion1;
		private String asignacion2;
		private String asignacion3;
		private String asignacion4;
		private String asignacion5;
		private String asignacion6;
		private String asignacion7;
		private String asignacion8;
		
		public int getIdAsignatura() {
			return idAsignatura;
		}
		public void setIdAsignatura(int idAsignatura) {
			this.idAsignatura = idAsignatura;
		}
		public String getAsignacion1() {
			return asignacion1;
		}
		public void setAsignacion1(String asignacion1) {
			this.asignacion1 = asignacion1;
		}
		public String getAsignacion2() {
			return asignacion2;
		}
		public void setAsignacion2(String asignacion2) {
			this.asignacion2 = asignacion2;
		}
		public String getAsignacion3() {
			return asignacion3;
		}
		public void setAsignacion3(String asignacion3) {
			this.asignacion3 = asignacion3;
		}
		public String getAsignacion4() {
			return asignacion4;
		}
		public void setAsignacion4(String asignacion4) {
			this.asignacion4 = asignacion4;
		}
		public String getAsignacion5() {
			return asignacion5;
		}
		public void setAsignacion5(String asignacion5) {
			this.asignacion5 = asignacion5;
		}
		public String getAsignacion6() {
			return asignacion6;
		}
		public void setAsignacion6(String asignacion6) {
			this.asignacion6 = asignacion6;
		}
		public String getAsignacion7() {
			return asignacion7;
		}
		public void setAsignacion7(String asignacion7) {
			this.asignacion7 = asignacion7;
		}
		public String getAsignacion8() {
			return asignacion8;
		}
		public void setAsignacion8(String asignacion8) {
			this.asignacion8 = asignacion8;
		}			
	
	
}
